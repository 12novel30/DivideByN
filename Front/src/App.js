import React from "react";
import "./App.css";
import Home from "./js/Home";
import Profile from "./js/Profile";
import LogIn from "./js/LogIn";
import Register from "./js/Register";
import Calendar from "./js/Calendar";
import { CreateEvent } from "./js/CreateEvent";
import CreateUser from "./js/CreateUser";
import EventDescription from "./js/EventDescription";
import { Routes, Route } from "react-router-dom";

const App = () => {
  return (
    <div>
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/profile/:username" element={<Profile />} />
        <Route path="/login" element={<LogIn />} />
        <Route path="/register" element={<Register />} />
        <Route path="/calendar" element={<Calendar />} />
        <Route path="/createEvent" element={<CreateEvent />} />
        <Route path="/createUser" element={<CreateUser />} />
        <Route path="/event/:place" element={<EventDescription />} />
      </Routes>
    </div>
  );
};

export default App;
