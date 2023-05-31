Program which automates manual GUI authentication process of Cisco Anyconnect.

Usage:

`java -jar AnyconnectAutomation-1-jar-with-dependencies.jar <path to properties file>`

If properties file is not specified, default file is app.properties which should be located in the same folder

Properties used by program:

Credentials:
1. `vpn.username`
2. `vpn.password `

VPN executable location:
1. `vpn.location` (default value is /opt/cisco/anyconnect/bin/vpnui)

Example of configuration of bash alias (should be located in ~/.bash_aliases):

`alias vpn='java -jar /home/yurii/IdeaProjects/AnyconnectAutomation/target/AnyconnectAutomation-1-jar-with-dependencies.jar /home/yurii/Interswitch/email.txt'`

Example of configuration of Ubuntu Application (should be located in /usr/share/applications/<appname>):

`[Desktop Entry]
Type=Application
Name=VPN
Comment=run this to launch anyconnect with credentials
Exec=java -jar /home/yurii/IdeaProjects/AnyconnectAutomation/target/AnyconnectAutomation-1-jar-with-dependencies.jar /home/yurii/Interswitch/email.txt
Icon=cisco-anyconnect
Terminal=false
Encoding=UTF-8
StartupNotify=true`