Feature: login

  Scenario: Validate login functionality
    Given Select the following values for Custom Grid
      | Asset State               | Assert1 |
      | Name                      | Assert2 |
      | Responsible Employee Name | Assert3 |
      | Current Location Name     | Assert4 |
      | Scan Code                 | Assert5 |
      | Manufacturer and model    | Assert6 |
 When Verify assetType label
      |Asset type|
      |Gateway assets|
      |Unique assets |
      | Container/Kits|
      |Vans|
      |Heavy equipments|