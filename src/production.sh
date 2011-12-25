#Build Production
mvn clean install
#Upload application to google app spots.
'/Volumes/Data/Java/Code Library/Java/appengine-java-sdk-1.5.3/bin/appcfg.sh' -e dungvn3000@gmail.com --enable_jar_splitting update '/Users/dungvn3000/Projects/smvp4g_website/src/server/target/server-1.0/'
