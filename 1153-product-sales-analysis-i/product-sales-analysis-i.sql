# Write your MySQL query statement below
select t.product_name,s.year,s.price from Sales s left join Product t on s.product_id =t.product_id order by sale_id;