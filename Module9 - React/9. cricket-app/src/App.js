import React from "react";
import ListofPlayers from "./components/ListofPlayers";
import IndianPlayers from "./components/IndianPlayers";
import "./App.css";

function App() {

  // Change this flag to see different outputs
  const flag = true;

  if (flag) {
    return (
        <div className="App">
          <h1>Cricket App</h1>
          <ListofPlayers />
        </div>
    );
  } else {
    return (
        <div className="App">
          <h1>Cricket App</h1>
          <IndianPlayers />
        </div>
    );
  }
}

export default App;