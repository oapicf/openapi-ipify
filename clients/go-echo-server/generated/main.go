package main

import (
	"github.com/cliffano/openapi-ipify/handlers"
	"github.com/labstack/echo/v4"
	"github.com/labstack/echo/v4/middleware"
)

func main() {
	e := echo.New()

    //todo: handle the error!
	c, _ := handlers.NewContainer()

	// Middleware
	e.Use(middleware.Logger())
	e.Use(middleware.Recover())


	// GetIp - Get your public IP address
	e.GET("/", c.GetIp)


	// Start server
	e.Logger.Fatal(e.Start(":8080"))
}