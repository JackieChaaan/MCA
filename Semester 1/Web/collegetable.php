<?php

$co=new mysqli("localhost","root","","macollege");

if($co->connect_error)
{
    die("Access Denied");
}
$qtb="create table department(dept_id int(2) PRIMARY KEY,dept_name varchar(5) NOT NULL,dept_hod varchar(5) NOT NULL,dept_facltyadv varchar(5) NOT NULL)";
if($co->query($qtb))
{
    echo 'Table created successfully';
}
else
{
    echo 'Error'.$co->error;
}
$co->close();