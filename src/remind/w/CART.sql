--5. SQL 문제 --
--CARTS 테이블과 CART_PRODUCTS 테이블이 있다.
--CARTS 테이블에는 id, total_order, item_id 등이 있고
-- CART_PRODUCTS 테이블에는 id(primary key이고 carts_products 테이블의 아이디), cart_id 등.
-- 문제는 CART 테이블에서 total_order 데이터가 잘못돼서 (장바구니 내 아이템의 개수를 표시한 데이터) CART_PRODUCTS에서
-- 동일 cart_id를 조회했을 때 나오는 개수와 맞지 않다는 것
-- 이 데이터베이스에서 이 개수가 맞지 않는 CART_ID, 틀린 개수인 wrong, 맞는 개수인 correct를 조회하는 sql문.

SELECT
    c.id,
    c.total_order AS wrong,
    COUNT(p.cart_id) AS correct
FROM
    CARTS AS c JOIN CART_PRODUCTS AS p ON c.id = p.cart_id
GROUP BY
    c.id, c.total_order
HAVING
    c.total_order <> COUNT(p.cart_id);
