<?php
$con=new mysqli('localhost','root','','regformdb');
if($con->connect_error)
{
    die('Access Denied');
}
$tbq='create table reg(id int(2) PRIMARY KEY AUTO_INCREMENT,name varchar(5) NOT NULL,gender varchar(5) NOT NULL,dob date NOT NULL,address varchar(10) NOT NULL,phone int(2) NOT NULL,guardian varchar(5) NOT NULL,hobbies varchar(10) NOT NULL,exa varchar(5) NOT NULL,course varchar(5) NOT NULL)';
if($con->query($tbq))
{
    echo 'Successfully created';
}
else{
    echo 'Error'.$con->error;
}
$con->close()
?>
