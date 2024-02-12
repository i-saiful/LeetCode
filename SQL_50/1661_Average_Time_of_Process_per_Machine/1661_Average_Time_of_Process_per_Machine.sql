# Write your MySQL query statement below
SELECT
    T1.machine_id,
    ROUND(AVG(T2.timestamp - T1.timestamp), 3) AS processing_time 
FROM
    Activity AS T1,
    Activity AS T2
WHERE
    T1.machine_id = T2.machine_id
    AND T1.process_id = T2.process_id
    AND T1.activity_type = "start"
    AND T2.activity_type = "end"
GROUP BY
    T1.machine_id