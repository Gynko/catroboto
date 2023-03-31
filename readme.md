# 😸CatRoboto😸 <!-- omit in toc -->

A test for a junior fullstack dev position.

# Table of content <!-- omit in toc -->

- [0. Assignment](#0-Assignment)
- [1. Starting point](#1-starting-point)
- [2. Process](#2-process)
- [3. Conclusions](#3-conclusions)

# 0. Assignment

## User story
As a potential cat owner, I want to get a random cat name and breed, so that I can find a good name and breed combination for my cat.

## Specifications
- We want a web application that will allow the visitor to click a button and get a random
cat name and breed.
- The cat’s name will randomly be chosen among: Axle, Babbles, Lucy, Jake, Zoe, Lily,
Penny, Wallace, Stella, Sarah
- The cat’s breed will be randomly chosen among: Abyssinian, Aegean, Balinese, Bombay,
British Shorthair, Chartreux, Maine Coon, Pixie-bob
- We want to secure the logic of choosing the cat’s name and breed so the name cannot be
chosen in the frontend.
- We don't want to host a database for the names and breeds so they should be part of the
backend application.

### Recommendations
• We prefer the backend to be written in Java with Spring Boot and the frontend in Vue or
Angular, but you may use other languages/frameworks if you want.
• We prefer the backend to be a REST API and the frontend a SPA.
Key points of the challenge
• Readable and self-explanatory code.
• Following SOLID principles.
• Following the MVC pattern.
Points that will be appreciated but not required
• Expanding the MVC pattern with DTOs, Services and Factories will be appreciated.
• Following the Dependency Inversion Principle and using Dependency Injection will be
appreciated.
• Test automation will be appreciated.
• Portable hosting (e.g., using Docker) will be appreciated.

# 1. Starting point

To help you evaluate this work, here was my starting point:

1. No knowledge of Java & of the Spring framework whatsoever.
2. Basic Backend understanding: I delved a bit into some sql / postgres / express.js, but that was for a week or two, one+ year ago and pretty elementary.
3. I worked full days from Monday to Saturday.

# 2. Process

1. I started to work on the backend, with the primary idea that I had to figure out how to make Spring send me a Json object that I could fetch on the frontend.
2. I found this somewhat old ressource: https://medium.com/bb-tutorials-and-thoughts/how-to-develop-and-build-react-app-with-java-backend-c1e6c5c93ae
3. I started to follow/code the ressource on vscode but ran into tons of dependency problems of outdated libraries, build errors of classes and so on
4. I thought I needed a deeper understanding and bought the course https://www.udemy.com/course/spring-framework-5-beginner-to-guru/

Lessons after lessons I gained a better understanding of the ways to architect a spring app. More precisely:

1. Understanding the MVC architecture around the spring apps, as well as the terminology (Beans, context, annotations..)
2. Understanding the underlying role of the spring context, which creates all the connections under the hood, in particular the role of annotations
3. Got into dependency injection and inversion of control, the different ways to do it (constructors, setters, properties), learned about qualifiers, primary beans, spring profiles which help to architect the app
4. Learned about modules, and how we can split the project in a project.data and project.web for example
5. Learned a lot about Java, the POJOs, interfaces. Prior knowledge of Javascript was a great help.
6. Learned about thymeleaf, Maven and some other things from the Spring ecosystem
7. Learned to use IntelliJ IDEA

# 3. Conclusions

I had a blast. It was really cool to dive into a new language like Java and the Spring world. Anyhow I am really interested in the backend even though I am in the Frontend class :).

Unfortunately, I did not come to the point where I managed to return a valid JSON object to my frontend. (Moreover, I saw possible to get the backend to send me a random item but did not had time to try this).

I fiddled a lot with Jackson, stringifying, annotations, but I did not get to the point where it worked :(. I do "feel" though that it is not very far away and a couple of days might have done the trick :)

Thank you for the challenge. I put in all I got, was way out of my comfort zone (2-3 first days were really like a hike in the jungle at night!).

Yoann.
