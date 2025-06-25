package com.viniciusanholeto.aplicometro.domains.users.ports;

import com.viniciusanholeto.aplicometro.domains.users.models.UserModel;
import java.util.Optional;

public interface UserDatabasePort {

  /**
   * Finds a user by their email.
   * @param email the email of the user to find
   * @return an Optional containing the UserModel if found, or empty if not found
   */
  Optional<UserModel> findUserByEmail(String email);

  /**
   * Saves a user to the database.
   * @param user the UserModel to save
   * @return an Optional containing the saved UserModel, or empty if the save operation failed
   */
  Optional<UserModel> saveUser(UserModel user);

  /**
   * Deletes a user by their email.
   * @param email the email of the user to delete
   */
  void deleteUser(String email);

  /**
   * Saves user credentials, including email, password hash, and salt.
   * @param email the user's email
   * @param passwordHash the hashed password of the user
   */
  void saveUserCredentials(String email, String passwordHash);
}
