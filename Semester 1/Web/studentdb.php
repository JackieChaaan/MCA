<?php

    $aa=new mysqli("localhost","root","");
    if($aa->connect_error)
    {
        die('connection failed'.$aa->connect_error);
    }
    $ab="create database studentdb2";
    if($aa->query($ab))
    {
        echo 'Database created';
    }
    else{
        echo 'Error Found'.$aa->error;
    }
    $aa->close();
?>
