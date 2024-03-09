package handlers
import (
	"github.com/oapicf/openapi-ipify/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// GetIp - Get your public IP address
func (c *Container) GetIp(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

