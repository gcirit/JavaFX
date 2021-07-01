Become a JavaFX GOD!!!
Install Java
Follows the steps explained in the link below. https://openjfx.io/openjfx-docs/#install-java

Install JavaFX
Installation guide for modular/non-modular, manual, IntelliJ, Eclipse and more are described in the link below. https://openjfx.io/openjfx-docs/#install-javafx

Set the Permanent Path
To execute Java applications from command line, we need to set Java Path. To set the path, follow the following steps. JavaFX Install Java Set the Permanent Path Right click on "this PC". It can be named as "My Computer" in some systems. Choose "properties" from the options. Click on "Advanced system settings" to continue. Click on "Environment Variables" to continue. Enter "path" in variable name and enter the path to the bin folder inside your JDK in the variable value. Click OK.

Now Java Path has been set up. Open the Command prompt and type "javac" In case you have already open up the command prompt, I suggest you to close the existing window and reopen it again.

Set JavaFX Permanent Path
The Java has been installed on our system. Now, we need to configure IDEs like NetBeans or Eclipse in order to execute JavaFX applications.

Install your preferred IDE. (Eclipse in this specific example)

Export JavaFX jar files to the Java Project Java Build Path → Libraries → Add Library → User Library → Next → New
→ Just enter JavaFX in the user library name and press OK. → Click on Add External JARs from the list given on the right side of the system and choose appropriate JAR files from the system. → Add all the jar files in your JavaFx Path/lib directory

VM Options Configuration
"Run" Menu ->
"Run Configurations..."
Select (Your Run Configuration)
Select "VM Arguments/Options" Tab
Paste into "VM Arguments" text box --module-path "path to javafx-sdk-16\lib" --add-modules javafx.controls,javafx.fxml -Djavafx.verbose=true -Dprism.verbose=true
