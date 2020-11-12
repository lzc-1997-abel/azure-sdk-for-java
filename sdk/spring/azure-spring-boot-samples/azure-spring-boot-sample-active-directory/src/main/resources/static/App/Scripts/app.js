﻿'use strict';
angular.module('todoApp', ['ngRoute', 'MsalAngular'])
    .config(['$routeProvider', '$httpProvider', 'msalAuthenticationServiceProvider', function ($routeProvider, $httpProvider, msalProvider) {

        $routeProvider.when("/Home", {
            controller: "homeCtrl",
            templateUrl: "/App/Views/Home.html",
        }).when("/TodoList", {
            controller: "todoListCtrl",
            templateUrl: "/App/Views/TodoList.html",
            requireLogin: true,
        }).when("/UserData", {
            controller: "userDataCtrl",
            templateUrl: "/App/Views/UserData.html",
        }).otherwise({redirectTo: "/Home"});

        window.applicationConfig = {
            clientID: '762eb4c6-0597-4585-a3cb-198827bdef0c'
        };

        msalProvider.init(
            {
                auth: {
                    clientId: "762eb4c6-0597-4585-a3cb-198827bdef0c",
                    authority: "https://login.microsoftonline.com/7bf345ec-5c80-41a1-94ad-07ff910be5d8",
                    redirectUri: "http://localhost:8080/",
                },
                cache: {
                    cacheLocation: "sessionStorage", // This configures where your cache will be stored
                    storeAuthStateInCookie: false, // Set this to "true" if you are having issues on IE11 or Edge
                },
                system: {
                    loggerOptions: {
                        loggerCallback: (level, message, containsPii) => {
                            if (containsPii) {
                                return;
                            }
                            switch (level) {
                                case msal.LogLevel.Error:
                                    console.error(message);
                                    return;
                                case msal.LogLevel.Info:
                                    console.info(message);
                                    return;
                                case msal.LogLevel.Verbose:
                                    console.debug(message);
                                    return;
                                case msal.LogLevel.Warning:
                                    console.warn(message);
                                    return;
                            }
                        }
                    }
                }
            }
            ,
            $httpProvider
        );
    }]);
