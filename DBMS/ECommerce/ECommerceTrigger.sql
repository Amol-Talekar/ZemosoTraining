CREATE DEFINER = CURRENT_USER TRIGGER `mydb`.`Order_BEFORE_INSERT` BEFORE INSERT ON `Order` FOR EACH ROW
BEGIN
IF(NEW.Date_of_Booking = (SELECT Date_of_Booking FROM Orders WHERE Customer.Customer_ID = NEW.Customer_ID))
		THEN
        select "Not possible to place the order.Try Again!!";
	END IF;
END
