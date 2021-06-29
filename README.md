# JavaFX

Become a JavaFX GOD!!!

INSTALLAION INSTRUCTIONS.
Install Java

Step 1: Verify that it is already installed or not Check whether Java is already installed on the system or not. In my case, it is not installed therefore I need to install JDK 1.8 on my computer.

JavaFX Install Java Step 2: Download JDK Click the below link to download jdk 1.8 for you windows 64 bit system.

Download JDK For Windows There are available releases for Linux and mac operating systems. You can visit the official link for JDK distributions i.e.

JDK Downloads Step 3: Install JDK Open the executable file which you have just downloaded and follow the steps.

JavaFX Install JDK Click Next to continue

JavaFX Install JDK 1 Just Choose Development Tools and click Next.

JavaFX Install JDK 2 Set up is being ready.

JavaFX Install JDK 3 Choose the Destination folder in which you want to install JDK. Click Next to continue with the installation.

JavaFX Install JDK 4 Set up is installing Java to the computer.

JavaFX Install JDK 5 We have successfully installed Java SE development kit 8. Close the installation set up.

Step 4 : Set the Permanent Path To execute Java applications from command line, we need to set Java Path. To set the path, follow the following steps.

JavaFX Install Java Set the Permanent Path Right click on "this PC". It can be named as "My Computer" in some systems. Choose "properties" from the options.

JavaFX Install Java Set the Permanent Path 1 The screen look alike the above image will open. Click on "Advanced system settings" to continue.

JavaFX Install Java Set the Permanent Path 2 Above window will open. Click on "Environment Variables" to continue.

JavaFX Install Java Set the Permanent Path 3 Enter "path" in variable name and enter the path to the bin folder inside your JDK in the variable value. Click OK.

Now Java Path has been set up. Open the Command prompt and type "javac" In case you have already open up the command prompt, I suggest you to close the existing window and reopen it again.

We will get javac executed as shown in the image below.

JavaFX Install Java Set the Permanent Path 4 The Java has been installed on our system. Now, we need to configure IDEs like NetBeans or Eclipse in order to execute JavaFX applications.

Step 5 : Install your preferred IDE. (Eclipse in this specific example)

Step 6: Export JavaFX jar files to the Java Project Java Build Path → Libraries → Add Library → User Library → Next → New
→ Just enter JavaFX in the user library name and press OK. → Click on Add External JARs from the list given on the right side of the system and choose appropriate JAR files from the system. → Add all the jar files in your JavaFx Path/lib directory

Step 7: VM Options Configuration

"Run" Menu ->
"Run Configurations..."
Select (Your Run Configuration)
Select "Arguments" Tab
Paste into "VM Arguments" text box --module-path "path to javafx-sdk-16\lib" --add-modules javafx.controls,javafx.fxml -Djavafx.verbose=true -Dprism.verbose=true
