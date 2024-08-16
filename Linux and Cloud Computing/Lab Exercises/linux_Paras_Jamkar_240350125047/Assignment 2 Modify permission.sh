#Create the file /tmp/acl_file.
#1. Allow Larry and Curly to rwx the file.
#2. Don’t allow moe to access the file (rwx).
#3. All members of group stooges (except moe) should be able to access the
#file (rw).
#!/bin/bash
sudo groupadd stooges 
sudo useradd larry
sudo useradd curly
sudo useradd moe
sudo chmod 0666 acl_file
echo "Enter the user name"
read name
if [ "$name" == "larry" ];
then
	sudo chown larry acl_file
	sudo chmod 0766 acl_file
	echo "Permission granted"
elif [ "$name" == "curly" ];
then
	sudo chown larry acl_file
        sudo chmod 0766 acl_file
        echo "Permission granted"
elif [ "$name" == "moe" ];
then
	sudo chmod 0666 acl_file
	sudo chown moe:stooges acl_file
	echo "Permission only granted to the group"
else
	echo "Permission not granted"
fi
# execute the file
#root@ubuntu:/home/paras/dbda# ./access.sh
#groupadd: group 'stooges' already exists
#useradd: user 'larry' already exists
#useradd: user 'curly' already exists
#useradd: user 'moe' already exists
#Enter the user name
#moe
#Permission only granted to the group
#root@ubuntu:/home/paras/dbda# ./access.sh
#groupadd: group 'stooges' already exists
#useradd: user 'larry' already exists
#useradd: user 'curly' already exists
#useradd: user 'moe' already exists
#Enter the user name
#par
#Permission not granted