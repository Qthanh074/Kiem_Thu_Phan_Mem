// File: cypress/e2e/cart_spec.cy.js

describe('Cart and Checkout Test', () => {
  // beforeEach chạy trước mỗi bài test để đăng nhập sẵn
  beforeEach(() => {
    cy.visit('https://www.saucedemo.com');
    cy.get('#user-name').type('standard_user');
    cy.get('#password').type('secret_sauce');
    cy.get('#login-button').click();
  });

  // Kịch bản 3: Thêm sản phẩm vào giỏ
  it('Should add a product to the cart', () => {
    cy.get('.inventory_item').first().find('.btn_inventory').click();
    cy.get('.shopping_cart_badge').should('have.text', '1');
  });

  // Kịch bản 4: Sắp xếp sản phẩm (Low to High)
  it('Should sort products by price low to high', () => {
    cy.get('.product_sort_container').select('lohi'); // Chọn option Low to High
    // Kiểm tra giá sản phẩm đầu tiên là $7.99
    cy.get('.inventory_item_price').first().should('have.text', '$7.99');
  });

  // --- PHẦN BÀI TẬP YÊU CẦU THÊM ---

  // Yêu cầu 1: Kiểm tra chức năng xóa sản phẩm
  it('Should remove a product from the cart', () => {
    // 1. Thêm sản phẩm vào giỏ trước
    cy.get('.inventory_item').first().find('.btn_inventory').click();
    // Kiểm tra đã lên số 1 chưa
    cy.get('.shopping_cart_badge').should('have.text', '1');
    
    // 2. Nhấn nút "Remove" (Sau khi thêm, nút Add to cart đổi thành Remove)
    cy.contains('Remove').click();

    // 3. Xác minh số lượng sản phẩm biến mất (không tồn tại badge nữa)
    cy.get('.shopping_cart_badge').should('not.exist');
  });

  // Yêu cầu 2: Kiểm tra quy trình thanh toán (Checkout)
  it('Should complete the checkout process', () => {
    // 1. Thêm sản phẩm
    cy.get('.inventory_item').first().find('.btn_inventory').click();
    
    // 2. Đi đến giỏ hàng (Click icon giỏ hàng)
    cy.get('.shopping_cart_link').click();
    
    // 3. Nhấn Checkout
    cy.get('#checkout').click();
    
    // 4. Điền thông tin
    cy.get('#first-name').type('John');
    cy.get('#last-name').type('Doe');
    cy.get('#postal-code').type('12345');
    
    // 5. Nhấn Continue
    cy.get('#continue').click();
    
    // 6. Xác minh chuyển hướng đến trang step-two
    cy.url().should('include', '/checkout-step-two.html');
  });
});