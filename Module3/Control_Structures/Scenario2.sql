ALTER TABLE Customers
ADD IsVIP VARCHAR2(5);

DECLARE
   CURSOR c_customers IS
      SELECT CustomerID, Balance
      FROM Customers;
BEGIN
   FOR rec IN c_customers LOOP
      IF rec.Balance > 10000 THEN
         UPDATE Customers
         SET IsVIP = 'TRUE'
         WHERE CustomerID = rec.CustomerID;

         DBMS_OUTPUT.PUT_LINE('VIP Customer : ' || rec.CustomerID);
      END IF;
   END LOOP;
   COMMIT;
END;
/