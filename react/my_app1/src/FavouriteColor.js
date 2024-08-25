import { useState } from "react";
import ReactDOM from "react-dom/client";

function FavoriteColor() {
  const [color, setColor] = useState("red");

  return (
    <>
      <h1>My favorite color is {color}!</h1>
       <button type="button"
        onClick={() => setColor("blue")}
       >Blue</button>
       <button type="button"
        onClick={() => setColor("orange")}
       >Orange</button>
    </>
  )

}

export default FavoriteColor;