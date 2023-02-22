<?php
    $bb=new mysqli("localhost","root","","studentdb");
    if($bb->connect_error)
    {
        die("Connection error".$bb->connect_error);
    }
    $q="create table stable(Rollnum int(2) PRIMARY KEY,Name VARCHAR(10) NOT NULL,Semester VARCHAR(10) NOT NULL,sub1 int(2) NOT NULL, sub2 int(2) NOT NULL,sub3 int(2) NOT NULL,Total int(2) NOT NULL)";
    if($bb->query($q))
    {
        echo 'Table is created';
    }
    else{
        echo 'Error'.$bb->error;
    }
    $bb->close();
?>
