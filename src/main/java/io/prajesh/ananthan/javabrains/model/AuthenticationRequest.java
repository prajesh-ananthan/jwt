package io.prajesh.ananthan.javabrains.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by prajesh.ananthan on 11/4/2020.
 *
 * @author Prajesh Ananthan, AirAsia BIG Sdn. Bhd.
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthenticationRequest {
    private String username;
    private String password;
}
