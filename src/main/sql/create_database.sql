# A common convention is to create a new database for each new application.
# Convention dictates creating a database user specific to the application.
# For example, we want reviewlister_user rather than Jane or Bob.
CREATE DATABASE reviewlister_db;

# We absolutely 100% need to avoid committing passwords.
# This only exists as an educational resource.
CREATE USER 'reviewlister_user'@'localhost' IDENTIFIED BY 'changeme';

# Grant permissions for this user only on the reviewlister_db.
# Constraining permissions limits access to other databases and tables in case the account is compromised.
GRANT ALL ON reviewlister_db.* TO 'reviewlister_user'@'localhost';

