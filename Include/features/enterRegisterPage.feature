Feature: User dapat direct ke halaman register

  Background:
    Given user berada pada halaman dashboard

  Scenario Outline: User dapat direct ke halaman register dan verifikasi komponen pada halaman tersebut
    When user klik register button
    Then user verifikasi field "<label>" terdapat pada halaman register
    And user melihat masih terdapat button login

    Examples:
      | label                |
      | User ID:             |
      | New password:        |
      | Repeat password:     |
      | First name:          |
      | Last name:           |
      | Email:               |
      | Phone:               |
      | Address 1:           |
      | Address 2:           |
      | City:                |
      | State:               |
      | Zip:                 |
      | Country:             |
      | Language Preference: |
      | Favourite Category:  |
      | Enable MyList        |
      | Enable MyBanner      |
      | Manchester United	 |
