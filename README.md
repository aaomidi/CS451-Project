# CS451 Project
## Telegram Game Engine

### Compilation and Running Guide

1. Install JDK 1.8 and Maven.
2. `mvn clean package`
3. `java -jar jar/GameEngine.jar`

### Configuration Guide

1. You must register a new bot with BotFather for this to work. The guide to do so is available here: https://core.telegram.org/bots
2. You need to ensure inline mode is turned on and feedback is set to 100%.
3. Make a copy of the sample config file and use it to configure the bot.

### Testing

The telegram library is taken as is, and since testing it requires an external service it is considered untestable. Mocking the behavior would essentially be reimplementing the entire bot library which would make no sense.
