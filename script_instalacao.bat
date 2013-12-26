mkdir "C:\Program Files\SIROC"
xcopy %1\dist "C:\Program Files\SIROC\" /e
xcopy %1\xml "C:\Program Files\SIROC\" /e
mkdir C:\Users\%2\Documents\SIROC
mkdir C:\Users\%2\Documents\SIROC\Backups
mkdir C:\Users\%2\Documents\SIROC\pdfs

"C:\Program Files\PostgreSQL\9.2\bin\createdb.exe" -U postgres teste2