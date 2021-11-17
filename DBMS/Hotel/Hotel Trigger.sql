CREATE DEFINER = CURRENT_USER TRIGGER `mydb`.`Hotel_BEFORE_INSERT` BEFORE INSERT ON `Hotel` FOR EACH ROW
BEGIN
if(Select count(Customer_id) from Hotel where Hotel.CheckOut_Time is null and Hotel.Customer_id=new.Customer_id)
then
select "You can't book again without checking out first";
END if;
END
