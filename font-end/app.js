import {
    renderMain
} from './main-bar-component.js';

const displayHome = () => {
    const container = document.querySelector('.container');
    container.prepend(renderMain());
}

displayHome();