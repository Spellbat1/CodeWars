-- Replace with your SQL query
SELECT CAST(created_at AS DATE) AS date, COUNT(*), 
CAST(SUM(COUNT(*)) OVER(ORDER BY CAST(created_at AS DATE)) AS INTEGER)
AS total FROM posts GROUP BY date;
