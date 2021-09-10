const express = require("express")
const app = express()
const cors = require("cors")
app.use(
    cors({
        origin: "*",
    })
)

import {
    renderMain
} from './main-bar-component.js';

import {
    renderSide
} from './side-bar-component.js'

const displayHome = () => {
    const container = document.querySelector('.container');
    container.prepend(renderMain());
    container.prepend(renderSide());
}

displayHome();

