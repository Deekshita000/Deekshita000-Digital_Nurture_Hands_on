INSERT INTO department (dp_id, dp_name) VALUES (1, 'Payroll');

INSERT INTO employee (em_id, em_name, em_salary, em_permanent, em_date_of_birth, em_dp_id)
VALUES (1, 'John Doe', 75000.0, 1, '1995-05-15', 1);

INSERT INTO skill (sk_id, sk_name) VALUES (1, 'Java');

INSERT INTO employee_skill (es_em_id, es_sk_id) VALUES (1, 1);

INSERT INTO user (us_id, us_name) VALUES (1, 'Alice');

INSERT INTO attempt (at_id, at_date, at_score, at_us_id) VALUES (1, '2026-07-20', 95.0, 1);

