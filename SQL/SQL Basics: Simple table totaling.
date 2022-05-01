-- Create your SELECT statement here
SELECT RANK() OVER(ORDER BY SUM(points) DESC) Rank, 
CASE WHEN COALESCE(clan, '') = '' THEN '[no clan specified]' ELSE clan END, 
SUM(points) AS total_points, COUNT(name) AS total_people
FROM people GROUP BY clan;
