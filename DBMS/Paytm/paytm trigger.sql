CREATE DEFINER = CURRENT_USER TRIGGER `mydb`.`Customer_BEFORE_INSERT` BEFORE INSERT ON `Customer` FOR EACH ROW
BEGIN
if(new.Branch_ID=(select Branch_ID from Branches where Customer.Customer_ID=new.Customer_ID))
then
 select "Customer cannot have two accounts in same branch";
end if;
END
