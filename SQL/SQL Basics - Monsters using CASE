/*  SQL  */
SELECT *, CASE
  WHEN top_half.heads > top_half.arms THEN 'BEAST'
  WHEN bottom_half.tails > bottom_half.legs THEN 'BEAST'
  ELSE 'WEIRDO'
END AS species
FROM top_half
JOIN bottom_half
  ON top_half.id = bottom_half.id
ORDER BY species;
