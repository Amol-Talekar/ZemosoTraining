CREATE DEFINER = CURRENT_USER TRIGGER `IRCTC`.`Ticket_BEFORE_INSERT` BEFORE INSERT ON `Ticket` FOR EACH ROW
BEGIN
IF(select count(Ticket.Ticket_No) from Ticket where Ticket.Customer_id=new.Customer_id)
    THEN
		IF((select Time_of_Departure from Ticket where Ticket.Customer_id) < (select Train.Arriving_Time from Train where Train.Train_id=new.Train_id))
		THEN
        select "It is not possible to book the ticket";
        END IF;
	END IF;

END
