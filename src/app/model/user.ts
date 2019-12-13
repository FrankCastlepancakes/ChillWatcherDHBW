export class User {
    firstName: string;
    lastName: string;
    iban: string;
    abo: number;
    city: string;
    email: string;
    houseNumber: number;
    postcode: number;
    street: string;
    password: string;

    constructor(
        firstName: string,
        lastName: string,
        iban: string,
        abo: number,
        city: string,
        email: string,
        houseNumber: number,
        postcode: number,
        street: string,
        password: string
      ) {
          this.firstName = firstName,
          this.lastName = lastName,
          this.iban = iban,
          this.abo = abo,
          this.city = city,
          this.email = email,
          this.houseNumber = houseNumber,
          this.postcode = postcode,
          this.street = street,
          this.password = password
      }
}
