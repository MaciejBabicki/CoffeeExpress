package CoffeeExpressProgramm.user;

import jakarta.websocket.OnOpen;

import javax.validation.constraints.NotBlank;

public record UserDTO(
        Integer id,
        @NotBlank
        String name,
        @NotBlank
        String password

) {
}
