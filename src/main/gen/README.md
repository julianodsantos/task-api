# org.openapitools.client - Kotlin client library for API de Tarefas

## Requires

* Kotlin 1.4.30
* Gradle 6.8.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *http://localhost:8080*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**tasksGet**](docs/DefaultApi.md#tasksget) | **GET** /tasks | Retorna todas as tarefas
*DefaultApi* | [**tasksIdGet**](docs/DefaultApi.md#tasksidget) | **GET** /tasks/{id} | Retorna uma tarefa pelo ID
*DefaultApi* | [**tasksPost**](docs/DefaultApi.md#taskspost) | **POST** /tasks | Cria uma nova tarefa


<a name="documentation-for-models"></a>
## Documentation for Models

 - [org.openapitools.client.models.Task](docs/Task.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

All endpoints do not require authorization.
