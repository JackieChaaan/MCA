<?php
$co=new mysqli("localhost","root","");
if($co->connect_error)
{
    die("Access Denied");
}
$dbq="create database macollege";
if($co->query($dbq))
{
    echo 'Database created successfully';
}
else
{
    echo 'Error'.$co->error;
}
$co->close();
