Modular project compile and run instructions (from project root):
1) Compile collegeinfo:
   javac -d collegeinfo/out --module-source-path collegeinfo/src $(find collegeinfo/src -name "*.java")
2) Compile app:
   javac -d app/out --module-source-path app/src -p collegeinfo/out $(find app/src -name "*.java")
3) Run:
   java --module-path collegeinfo/out:app/out -m app/app.MainApp

Notes:
On Windows replace : with ; in the --module-path.
