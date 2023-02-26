<?php
$con=new mysqli('localhost','root','');

if($con->connect_error)
{
    die('Access denied');
}
$dbq='create database regformdb';
if($con->query($dbq))
{
    echo "Database created successfully";
}
else
{
    echo 'Error'.$con->error;
}
$con->close();
?>

