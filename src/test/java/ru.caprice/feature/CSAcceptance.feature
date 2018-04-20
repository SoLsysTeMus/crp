@clientsite @accpt
  Feature: Acceptance of client site

    @writeappointment
    Scenario Outline: Successful registration to the appointment
      When I go to the MainPage
      And I select brand <brand>
      And I select year <year>
      And I select model <model>
      And I enter Email <email>
      And I click button "Оценить"
      Then I'm on the page "/step2/"
      Examples:
        |brand | year   | model              |email                    |
        |"BMW" | "2015" | "1er II (F20-F21)" |d.volkovskiy@carprice.ru |


      When I select city <city>
      And I select branch <branch>
      And I select date <date>
      And I select time <time>
      And I enter name <name>
      And I enter phone <phone>
      And I click button "Записаться"
      Examples:
        |city       |branch                 | date  | time | name        | phone        |
        |Москва и Мо| 1-й Митинский пер., 25| Today | 19:00| Дмитрий     | 9645380808   |

