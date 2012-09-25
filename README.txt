VMWare View Portal Overlay
==========================


 o Introduction
 o Requirements
 o Building
 o Installing
 o Disclaimer **HERE LIES DRAGONS**
 

Introduction
------------
VMware does not provide the VDI implementer with a way to overwrite the default 
web-page that is presented by the VMWare vdiconnect server when a user 
navigates to the connect server with a web browser. 

This did not fit our needs. 

We required a redirect to our main web site. There a user could find directions
of what to download and how to get started. A "landing page" of sorts.


Requirements
------------
Familiarity with java webapps is required.
Experience with the Tomcat container and the Maven build process is a plus.

This project is built with Maven. http://maven.apache.org


Building 
--------
To make use of this overlay you will need to clone the source from github.

  git clone https://github.com/kevinfoote/xportal-overlay.git

Edit the page design to meet your requirements. 

  src/main/java/org/extreme/pppoverlay/PortalOverlayServlet.java 

The PortalOverlayServlet.java file contains the output that is rendered when
this overlay is invoked.

When you have re-designed your page to your liking use maven to compile the 
overlay into a jar file.

  mvn -DskipTests install 

When this completes you will have a jar named xportal-overlay-1.0.jar in your 
target directory. Follow the remaining directions to make use of your new jar
overlay.


Installing
----------
You will be working directly with the java web-app war file.

See INSTALL


Disclaimer
----------
The above outlined project is known to work on VMWare View 5.1 and 5.1.1. Tested
and in production in our environment.

I'm sure VMWare would not approve of any involvement with the modification of 
the broker portal or any of its servlets. Additionally they will surely not 
offer any support for these modifications.

 ** USE THIS METHOD AT YOUR OWN RISK ** 

I take no responsibility of mishaps that happen by using this method / software.
You've been warned.

