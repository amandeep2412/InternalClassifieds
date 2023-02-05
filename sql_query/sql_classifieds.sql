create database classifiedsdb

--USER TABLE--------------------------------------------------
create table Users(
    userID INT IDENTITY(1,1),
    name NVARCHAR(50) NOT NULL,
    phone NVARCHAR(20) NOT NULL UNIQUE,
    email NVARCHAR(30) NOT NULL UNIQUE,
    password NVARCHAR(100) NOT NULL,
    address NVARCHAR(100),
    userType INT NOT NULL, --(1-Admin, 2-Buyer, 3-Seller)
    userStatus BIT NOT NULL,    --(1-Active, 0 Inactive)
    createdOn DATETIME DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY(userID));

select * from Users



