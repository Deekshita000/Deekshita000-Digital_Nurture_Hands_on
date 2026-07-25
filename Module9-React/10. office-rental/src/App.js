import './App.css';

function App() {

  // Single Office Object
  const office = {
    name: "Skyline Tech Park",
    rent: 55000,
    address: "Madhapur, Hyderabad",
    image: "/office.jpg"
  };

  // List of Office Objects
  const offices = [
    {
      id: 1,
      name: "Skyline Tech Park",
      rent: 55000,
      address: "Madhapur, Hyderabad",
      image: "/office.jpg"
    },
    {
      id: 2,
      name: "Cyber Towers",
      rent: 75000,
      address: "Hitech City, Hyderabad",
      image: "/office.jpg"
    },
    {
      id: 3,
      name: "Mindspace",
      rent: 45000,
      address: "Gachibowli, Hyderabad",
      image: "/office.jpg"
    }
  ];

  return (
      <div className="App">

        <h1>Office Space Rental App</h1>

        <h2>Featured Office</h2>

        <img
            src={office.image}
            alt="Office"
            className="officeImage"
        />

        <h3>Name : {office.name}</h3>

        <h3 style={{ color: office.rent < 60000 ? "red" : "green" }}>
          Rent : Rs. {office.rent}
        </h3>

        <h3>Address : {office.address}</h3>

        <hr />

        <h2>Available Office Spaces</h2>

        {
          offices.map((item) => (
              <div className="card" key={item.id}>

                <img
                    src={item.image}
                    alt="Office"
                    className="officeImage"
                />

                <h3>{item.name}</h3>

                <h3 style={{
                  color: item.rent < 60000 ? "red" : "green"
                }}>
                  Rent : Rs. {item.rent}
                </h3>

                <h3>{item.address}</h3>

              </div>
          ))
        }

      </div>
  );
}

export default App;