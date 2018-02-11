$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Amazon.feature");
formatter.feature({
  "line": 2,
  "name": "Amazon search",
  "description": "I want to verify Amazon search functionality \r\nwith multiple inputs",
  "id": "amazon-search",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "line": 10,
  "name": "Verifying Amazon search functionality",
  "description": "",
  "id": "amazon-search;verifying-amazon-search-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 9,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "user enters \"\u003cproducts\u003e\" in search bar",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user clicks on the search button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user validates the product search result",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user close the browser",
  "keyword": "And "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "amazon-search;verifying-amazon-search-functionality;",
  "rows": [
    {
      "cells": [
        "products"
      ],
      "line": 17,
      "id": "amazon-search;verifying-amazon-search-functionality;;1"
    },
    {
      "cells": [
        "dell"
      ],
      "line": 18,
      "id": "amazon-search;verifying-amazon-search-functionality;;2"
    },
    {
      "cells": [
        "samsung"
      ],
      "line": 19,
      "id": "amazon-search;verifying-amazon-search-functionality;;3"
    },
    {
      "cells": [
        "apple"
      ],
      "line": 20,
      "id": "amazon-search;verifying-amazon-search-functionality;;4"
    },
    {
      "cells": [
        "LG"
      ],
      "line": 21,
      "id": "amazon-search;verifying-amazon-search-functionality;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 6,
  "name": "(common step)",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "user is on Amazon search page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 18,
  "name": "Verifying Amazon search functionality",
  "description": "",
  "id": "amazon-search;verifying-amazon-search-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    },
    {
      "line": 9,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "user enters \"dell\" in search bar",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user clicks on the search button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user validates the product search result",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user close the browser",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.background({
  "line": 6,
  "name": "(common step)",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "user is on Amazon search page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 19,
  "name": "Verifying Amazon search functionality",
  "description": "",
  "id": "amazon-search;verifying-amazon-search-functionality;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    },
    {
      "line": 9,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "user enters \"samsung\" in search bar",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user clicks on the search button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user validates the product search result",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user close the browser",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.background({
  "line": 6,
  "name": "(common step)",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "user is on Amazon search page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 20,
  "name": "Verifying Amazon search functionality",
  "description": "",
  "id": "amazon-search;verifying-amazon-search-functionality;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    },
    {
      "line": 9,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "user enters \"apple\" in search bar",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user clicks on the search button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user validates the product search result",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user close the browser",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.background({
  "line": 6,
  "name": "(common step)",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "user is on Amazon search page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 21,
  "name": "Verifying Amazon search functionality",
  "description": "",
  "id": "amazon-search;verifying-amazon-search-functionality;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    },
    {
      "line": 9,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "user enters \"LG\" in search bar",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user clicks on the search button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user validates the product search result",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user close the browser",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.background({
  "line": 6,
  "name": "(common step)",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "user is on Amazon search page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 24,
  "name": "Verifying Amazon sortBy functionality",
  "description": "",
  "id": "amazon-search;verifying-amazon-sortby-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "user selects Price:Low to High from sort Dropdown",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "user validates the sortBy functionality results by checking the products price order",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});