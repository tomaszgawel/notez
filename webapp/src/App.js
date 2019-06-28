import React from 'react';
import './App.css';
import { BrowserRouter as Router, Route } from "react-router-dom";
import NavBar from "./components/NavBar";
import SignIn from "./components/pages/SignIn";
import SignUp from "./components/pages/SignUp";
import Profile from "./components/pages/Profile";
function App() {
  return (
      <Router>
          <div className="App">
              <NavBar/>
              <Route exact path={"/"} component={SignIn}/>
              <Route path={"/signup"} component={SignUp}/>
              <Route path={"/profile"} component={Profile}/>
          </div>
      </Router>

  );
}


export default App;
