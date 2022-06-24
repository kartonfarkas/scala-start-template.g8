# scala-start-template

## So, what is it?

We would like to present you a minimal setup for playing with Scala. 
So if you have never met this awesome language before, or you just need a basic setup for coding dojo 
you can easily kickstart it from here 

### By cloning this repo you will have:

- an [sbt](https://www.scala-sbt.org/) (a build tool) project setup
- [weaver](https://github.com/disneystreaming/weaver-test), a test framework
- and a 'hello world' like example with test 

## What do you need in order to see it working?

### java

A not too old JDK  is a must have, eg. [OpenJdk](https://openjdk.java.net/install/)

### sbt

if you want to use the general command line sbt tool and you are on Mac IMHO the easiest way to have it by installing it with homebrew:
```
brew install sbt
```
Hint: you can use the built in sbt shell as well in IntelliJ IDEA.
[See other options to get 'em](https://www.scala-sbt.org/1.x/docs/Installing-sbt-on-Mac.html)

## How to run it?

```
sbt "runMain example.Hello"
```

or simply in sbt shell:
```sbt
runMain example.Hello
```

## How to run the tests?

```
sbt test
```

or simply in sbt shell:
```sbt
test
```

## Do you need help or you have feedbacks, ideas?
Feel free to contact Segmentation Team (eg. on Slack @ `#team-segmentation`)