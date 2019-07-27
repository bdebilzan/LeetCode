/* X city opened a new cinema, many people would like to go to this cinema. 
The cinema also gives out a poster indicating the movies’ ratings and descriptions.
Please write a SQL query to output movies with an odd numbered ID and a description that is not 'boring'. 
Order the result by rating.

Link: https://leetcode.com/problems/not-boring-movies/

 Write your MySQL query statement below */

SELECT * FROM cinema
WHERE (id % 2 = 1)
AND (description <> 'boring')
ORDER BY rating DESC
