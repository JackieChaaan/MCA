class validate(Exception):pass
try:
    username="Abel@123"
    password="Abel"
    user=input("Enter username:" )
    passw=input("Enter password: ")
    if user!=username or passw!=password:
        raise validate("Invalide login credentials")
    else:
        print("Login success")
except validate as e:
    print(e)
