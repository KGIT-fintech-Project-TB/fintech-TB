import { configureStore } from "@reduxjs/toolkit";
import { modalSlice } from "../modal/modalReducer";
import { useDispatch } from "react-redux";


export const store = configureStore(
    {
        reducer: {
            modal: modalSlice.reducer
        }
    }
);

export type RootState = ReturnType<typeof store.getState>;
export type AppDispatch = typeof store.dispatch;
export const useAppDispatch: () => AppDispatch = useDispatch;